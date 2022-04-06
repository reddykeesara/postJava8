package primitive;

public class PrimitiveTypes {

	public PrimitiveTypes() {
		// TODO Auto-generated constructor stub
	}
	public PrimitiveTypes(char c, byte b, short s, int i, long l, float f, double d) {
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
	}

	public static void main(String[] args) {

		char c1 = '\u0000'; //Character.MIN_VALUE 4 bytes
		char c2 = '\uFFFF';
		byte b1 = -128; //Byte.MIN_VALUE 8bytes
		byte b2 = 127;
		short s1 = -32768; //Short.MIN_VALUE  16bytes
		short s2 = 32767;
		int i1 = 0x80000000; //min value 2sup31 32bytes  -2147483648
		int i2 = 0x7fffffff;  //Integer.MAX_VALUE 2sup31-1  2147483647
		
	    /**
	     * A constant holding the minimum value a {@code long} can
	     * have, -2<sup>63</sup>.
	     */
		long l1 = 0x8000000000000000L;//Long.MIN_VALUE //-9,223,372,036,854,775,808
		
	    /**
	     * A constant holding the maximum value a {@code long} can
	     * have, 2<sup>63</sup>-1.
	     */
		long l2 = 0x7fffffffffffffffL; //9,223,372,036,854,775,807
		
	    /**
	     * A constant holding the smallest positive nonzero value of type
	     * {@code float}, 2<sup>-149</sup>. It is equal to the
	     * hexadecimal floating-point literal {@code 0x0.000002P-126f}
	     * and also equal to {@code Float.intBitsToFloat(0x1)}.
	     */
		float f1 =  0x0.000002P-126f; // 1.4e-45f 
		
	    /**
	     * A constant holding the largest positive finite value of type
	     * {@code float}, (2-2<sup>-23</sup>)&middot;2<sup>127</sup>.
	     * It is equal to the hexadecimal floating-point literal
	     * {@code 0x1.fffffeP+127f} and also equal to
	     * {@code Float.intBitsToFloat(0x7f7fffff)}.
	     */
		float f2 =  0x1.fffffeP+127f; // 3.4028235e+38f //340,282,346,638,528,860,000,000,000,000,000,000,000.000000
		
	    /**
	     * A constant holding the smallest positive nonzero value of type
	     * {@code double}, 2<sup>-1074</sup>. It is equal to the
	     * hexadecimal floating-point literal
	     * {@code 0x0.0000000000001P-1022} and also equal to
	     * {@code Double.longBitsToDouble(0x1L)}.
	     */
		double d1 = 0x0.0000000000001P-1022; // 4.9e-324 MIN_VALUE
		
	    /**
	     * A constant holding the largest positive finite value of type
	     * {@code double},
	     * (2-2<sup>-52</sup>)&middot;2<sup>1023</sup>.  It is equal to
	     * the hexadecimal floating-point literal0x7fffffffffffffff
	     */
		double d2 = 0x1.fffffffffffffP+1023; // 1.7976931348623157e+308
		
		
		
		//float ff = 1234;
		PrimitiveTypes pt = new  PrimitiveTypes((char)1,(byte)2,(short)3,4,5,-9223372036854775808l,9223372036854775807l);
		
	}
}
