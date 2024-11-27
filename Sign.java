public class Sign 
{
    private String message;
    private int width;

    public Sign(String message, int width) 
    {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() 
    {
        if (message.isEmpty()) 
        {
            return 0;
        }

        return (message.length() + width - 1) / width;
    }


    public String getLines() 
    {
        if (message.isEmpty()) 
        {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) 
        {
            if (i > 0 && i % width == 0) 
            {
                result.append(";");
            }
            result.append(message.charAt(i));
        }
        
        return result.toString();
    }
}
