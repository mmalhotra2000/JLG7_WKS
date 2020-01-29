package edu.gs.thread;

import java.io.*;
import java.util.*;

public class LittleMonkAndFlipOperations {

	private static Reader scanner = new Reader();
	private static Print printer = new Print();

	public static void main(String[] args) throws IOException {
		new Thread(null, new Runnable() {
			public void run() {
				try {
					process();
					printer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, "1", 1 << 26).start();
	}

	private static class Print {
		private final BufferedWriter bw;

		public Print() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}

	private static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

	private static class Edge implements Comparable<Edge> {
		public int c;
		public String s;

		public Edge(String s, int c) {
			this.s = s;
			this.c = c;
		}

		public int compareTo(Edge o) {
			if (c != o.c)
				return c - o.c;
			return s.compareTo(o.s);
		}

		public String toString() {
			return "" + c + " " + s;
		}
	}

	private static int max = (int) (1e6 + 1);
	private static int mod = (int) (1e9 + 7);

	private static List<Integer> primes = new ArrayList<Integer>();

	private static void init() {
		boolean[] p = new boolean[max];
		p[0] = true;
		p[1] = true;
		for (int i = 2; i < max; i++) {
			if (p[i])
				continue;
			primes.add(i);
			for (int j = i + i; j < max; j += i) {
				p[j] = true;
			}
		}
	}

	private static void process() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		// int n = scanner.nextInt();
		for (int i1 = 1; i1 <= t; i1++) {
			br.readLine();
			int[][] time = new int[26][26];
			for (int i = 0; i < 26; i++) {
				String[] s = br.readLine().split(" ");
				for (int j = 0; j < 26; j++) {
					time[i][j] = Integer.parseInt(s[j]);
				}
			}
			boolean completed = false;
			while (!completed) {
				completed = true;
				for (int i = 0; i < 26; i++) {
					for (int j = 0; j < 26; j++) {
						int ct = time[i][j];
						for (int k = 0; k < 26; k++) {
							int nt = time[i][k] + time[k][j];
							if (nt < ct) {
								time[i][j] = nt;
								completed = false;
							}
						}
					}
				}
				
				
				//Math.min
			}
			char[] s1 = br.readLine().toCharArray();
			char[] s2 = br.readLine().toCharArray();
			int res = 0;
			for (int i = 0; i < s1.length; i++) {
				int idx1 = s1[i] - 'a';
				int idx2 = s2[i] - 'a';
				res += time[idx1][idx2];
				// printer.println(s1[i] + " " + idx1 + " " + s2[i] + " " + idx2 + " " +
				// time[idx1][idx2]);
			}
			printer.println(res);
		}
	}

}