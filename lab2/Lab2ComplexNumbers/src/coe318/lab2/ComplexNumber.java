package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
//Instance variable declarations
    double realn;
    double imagn;
    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
//Initialize the instance variables
    realn= re;
    imagn= im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return realn;	//A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return imagn;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        double rene= realn*(-1);
        double imne= imagn*(-1);
        ComplexNumber neco= new ComplexNumber(rene, imne);
        
        return neco; //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        double readd= realn + z.realn;
        double imadd= imagn + z.imagn;
        ComplexNumber dee= new ComplexNumber(readd, imadd);
        
        return dee; //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        double resub= realn - z.realn;
        double imsub= imagn - z.imagn;
        ComplexNumber ee= new ComplexNumber(resub, imsub);
        
        return ee;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        ComplexNumber og= new ComplexNumber(realn, imagn);
        
        double remult= (og.realn*z.realn)+((og.imagn*z.imagn)*-1);
        double immult= (og.realn*z.imagn)+((og.imagn*z.realn));
        ComplexNumber aych= new ComplexNumber(remult, immult);
        
        return aych;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        ComplexNumber og= new ComplexNumber(realn, imagn);
        ComplexNumber conj= new ComplexNumber(realn, (-1)*imagn);
        ComplexNumber nume= conj;
        double reald= (og.realn*conj.realn)+((og.imagn*conj.imagn)*-1);
       
        double repro= (nume.realn)/reald;
        double impro= (nume.imagn)/reald;
        ComplexNumber eff= new ComplexNumber(repro, impro);
        
        return eff;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
        ComplexNumber nume= new ComplexNumber(realn, imagn);
        ComplexNumber denom= z;
        ComplexNumber conj= new ComplexNumber(denom.realn, (-1)*denom.imagn);
        double reald= (denom.realn*conj.realn)+((denom.imagn*conj.imagn)*-1);
        ComplexNumber nume2= new ComplexNumber(((nume.realn*conj.realn)+(nume.imagn*conj.imagn)*-1),(nume.realn*conj.imagn)+(nume.imagn*conj.realn));
        
        double rediv= (nume2.realn)/reald;
        double imdiv= (nume2.imagn)/reald;
        ComplexNumber gee= new ComplexNumber(rediv, imdiv);
        
        return gee;	//A stub: to be fixed
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}