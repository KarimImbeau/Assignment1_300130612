// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointC extends PointCP
{

  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointC( double xOrRho, double yOrTheta)
  {

this.xOrRho = xOrRho;
this.yOrTheta = yOrTheta;
this.typeCoord = 'C';
  }
	
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
      return xOrRho;
  }
  
  public double getY()
  {
      return yOrTheta;
  }
  
  public double getRho()
  {
     return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));  
  }
  
  public double getTheta()
  {
      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }
  
  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */

public PointCP rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    PointCP point = new PointC( (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));

    return point;
  }

}
