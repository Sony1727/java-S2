interface student
{
int score=10;
void displayscore();
}
interface sports
{
int score=25;
void displaysports();
}
class Result implements student,sports
{
public void displayscore()
{
System.out.println("Acadamic score is:"+student.score);
}
public void displaysports()
{
System.out.println("sports score is:"+sports.score);
}
}
public class SportsResult
{
public static void main(String[] args)
{
Result r=new Result();
r.displayscore();
r.displaysports();
}
}
