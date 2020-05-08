package com.examples.java9;

import java.io.IOException;
import java.time.ZoneId;
import java.util.stream.Stream;

public class Java9ProcessAPIExample {
	public static void main(String[] a) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("notepad.exe");
		String np = "Not Present";
		Process p = pb.start();
		ProcessHandle.Info info = p.info();
		System.out.printf("Process ID : %s%n", p.pid());
		System.out.printf("Command name : %s%n", info.command().orElse(np));
		System.out.printf("Command line : %s%n", info.commandLine().orElse(np));
		System.out.printf("Start time: %s%n",
				info.startInstant().map(i -> i.atZone(ZoneId.systemDefault()).toLocalDateTime().toString()).orElse(np));

		System.out.printf("User : %s%n", info.user().orElse(np));

		Stream<ProcessHandle> liveProcesses = ProcessHandle.allProcesses();
		liveProcesses.filter(ProcessHandle::isAlive).forEach(ph -> {

			System.out.println(ph.pid());
			System.out.println(ph.info() + "::" + ph.info().command().isPresent());
		});
		ProcessHandle processHandle = ProcessHandle.current();
		ProcessHandle.Info processInfo = processHandle.info();
		System.out.println(processHandle.pid());
		System.out.println(processInfo.arguments());
		System.out.println(processInfo.command());
		System.out.println(processInfo.command().get().contains("java"));
		System.out.println(processInfo.startInstant());
		System.out.println(processInfo.totalCpuDuration());
		System.out.println(processInfo.user());

	}

}
