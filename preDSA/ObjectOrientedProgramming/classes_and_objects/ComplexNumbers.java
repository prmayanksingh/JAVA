package ObjectOrientedProgramming.classes_and_objects;

public class ComplexNumbers {
    private int Real;
    private int Imaginary;

    public ComplexNumbers(int real, int imaginary){
        this.Real = real;
        this.Imaginary = imaginary;
    }

    public int getReal(){
        return Real;
    }

    public int getImiganiry(){
        return Imaginary;
    }

    public void setReal(int real){
        this.Real = real;
    }

    public void setImaginary(int Imaginary){
        this.Imaginary = Imaginary;
    }
    
    public void multiply(ComplexNumbers c2){
        // this.Real = (this.Real * c2.Real) + (this.Real * c2.Imaginary);
        // this.Imaginary = (this.Imaginary * c2.Real) + (this.Imaginary * (- c2.Imaginary));
        int r = this.Real;
        this.Real = (this.Real * c2.Real) - (this.Imaginary * c2.Imaginary);
        this.Imaginary = (this.Imaginary * c2.Real) + (r * c2.Imaginary);        
    }

    public void plus(ComplexNumbers c2){
        this.Real = this.Real + c2.Real;
        this.Imaginary = this.Imaginary + c2.Imaginary;         
    }
    
    public static ComplexNumbers add (ComplexNumbers c1, ComplexNumbers c2){
        int realnum = c1.Real + c2.Real;
        int imaginarynum = c1.Imaginary + c2.Imaginary;
        ComplexNumbers c = new ComplexNumbers(realnum, imaginarynum);
        return c;
    }
    
    // public void conjugate(ComplexNum c1, ComplexNum c2){
    //     System.out.println(Real + " - " + "i" + "Imaginary");
    // }
    public void print (){
        System.out.println(Real + " + " + "i" + Imaginary);
    }
}