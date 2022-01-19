
/**
 *
 * @author Marcos
 */
public class Event
{

    private String eventTitle;
    private String eventLocation;
    private Date eventDate;
    private Time eventTime;

    public Event(String eventTitle, String eventLocation, Date eventDate, Time eventTime)
    {
        this.eventTitle = eventTitle;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
    }

    public String getEventTitle()
    {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle)
    {
        this.eventTitle = eventTitle;
    }

    public String getEventLocation()
    {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation)
    {
        this.eventLocation = eventLocation;
    }

    public Date getEventDate()
    {
        return eventDate;
    }

    public void setEventDate(Date eventDate)
    {
        this.eventDate = eventDate;
    }

    public Time getEventTime()
    {
        return eventTime;
    }

    public void setEventTime(Time eventTime)
    {
        this.eventTime = eventTime;
    }

    @Override
    public String toString()
    {
        return "Event [" + "eventTitle=" + eventTitle + ", eventLocation=" + eventLocation + ", eventDate=" + eventDate + ", eventTime=" + eventTime + ']';
    }

}
