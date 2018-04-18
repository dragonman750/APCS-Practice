//part a
public boolean maintenanceNeeded(int currMonth, int currYear)
{
    if (currYear > lastYearMaintained)
        return true;

    for (int x = flights.size()-1; i >=0 && x>=flights.size()-3; x--)
    {
        if (flights.get(x).hasMechanicalIssue())
            return true;
    }
    return false;
}
//part b
public List<Airplane> carrierMaintenance(String carrier, int currMonth, int currYear)
{
    List<Airplane> ourAirplanes = new ArrayList<Airplane>();

    for (int b=0; b<airplanes.length; b++)
    {
        if (airplanes[b].getCarrier().equals(carrier) && airplanes[b].maintenanceNeeded(currMonth, currYear))
        {
            ourAirplanes.add(airplanes[b]);
        }
    }
    return ourAirplanes;
}
  //part c
  
  public List<Airplane> carrierMaintenance(String carrier, int currMonth, int currYear)
  {
      List<Airplane> ourAirplanes = new ArrayList<Airplane>();

      for (Airplane a : airplanes)
      {
          if (a.getCarrier().equals(carrier) && a.maintenanceNeeded(currMonth))
          {
              ourAirplanes.add(a);
          }
      }
      return ourAirplanes;
  }
