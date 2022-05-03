package interviewQ;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.OutputStreamWriter;

public class SystemOutPrintln {

	public static void main(String[] args) {
		
		//public final class System
		
		//public class PrintStream extends FilterOutputStream	implements Appendable, Closeable
		
		System.out.println("");
		
		/*		  
		 *    private BufferedWriter textOut;
    	 *	  private OutputStreamWriter charOut;
		 * 
		 * private void writeln(String s) {
				        try {
				            synchronized (this) {
				                ensureOpen();
				                textOut.write(s);
				                textOut.newLine();
				                textOut.flushBuffer();
				                charOut.flushBuffer();
				                if (autoFlush)
				                    out.flush();
				            }
				        }*/
	}
}
