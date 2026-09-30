public class Autobus2
{  
    private String kennzeichen;
    private int sitzplaetze;
    private boolean anhaenger;
        
    public int getSitzplaetze()
    { return sitzplaetze;
    }
    public String getKennzeichen()
    { return kennzeichen;
    }
    public boolean getAnhaenger()
    { return anhaenger;
    }
    public void setKennzeichen(String neuKennzeichen)
    {
       kennzeichen = neuKennzeichen;
    }
    public void setSitzplaetze(int neuSitzplaetze)
    {
       sitzplaetze = neuSitzplaetze;
    }
    public void setAnhaenger(boolean neuAnhaenger)
    {
       anhaenger = neuAnhaenger;
    }
}