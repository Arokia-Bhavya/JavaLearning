package Immutable;

class UnModifiableAddress  extends Address implements Cloneable{

	public UnModifiableAddress(String firstLine, String secondLine, String city) {
		super(firstLine, secondLine, city);		
	}
	protected UnModifiableAddress clone() throws CloneNotSupportedException 
	{
		return (UnModifiableAddress) super.clone();
	}
	
	public void setFirstLine(String firstLine) {
        throw new UnsupportedOperationException();
    }
     
    public void setSecondLine(String secondLine) {
        throw new UnsupportedOperationException();
    }
     
    public void setCity(String city) {
        throw new UnsupportedOperationException();
    }
	
}
