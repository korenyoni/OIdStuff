import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 	Given a MazeRoom and a room name, the search facility of this class
 * 	will return a path to the desired room, if one exists.
 * 
 * 	The search will succeed, even if the maze contains cycles (i.e., loops).
 */
public class MazeSolver2
{
	private MazeRoom start;
	
	/**
	 * 	Initializes this object.
	 */
	public MazeSolver2()
	{
		start = MazeRoom.buildCyclicMaze();
	}
	
	/**
	 * 	Provides access to the maze entrance.
	 * 	@return the entrance to the maze.
	 */
	public MazeRoom getEntrance()
	{
		return start;
	}
	
	/**
	 * 	Finds a path from the current room in the maze to the room with the name
	 * 	provided by goal, if one exists.
	 * 	@param current the current room being searched.
	 * 	@param goal the name of the destination room.
	 * 	@param visited all the rooms already searched.
	 * 	@return a path from the current room to the goal (e.g., "A->F->G"), or
	 * 		null if no path exists.
	 */
	public String findPath(MazeRoom current, String goal,
			HashSet<MazeRoom> visited)
	{
			//int counter=0;
			String goals="AFGHBLCIMDJNEK";
			if(goals.lastIndexOf(goal.toUpperCase() ) == -1)
			{
				return null;
			}
			if(current.getName().equals(goal))
			{
				System.out.print("->"+current.getName());
				return ("Up your ass");
			}
			
			if(goal.equals(current.getName()))
			{
				return new String("finished");
			}
			if(current.goNorth() != null && !visited.contains(current.goNorth()) )
			{
				System.out.print("->"+current.getName());
				visited.add(current);
				return findPath(current.goNorth(), goal, visited);
			}
			if(current.goSouth() != null && !visited.contains(current.goNorth()) )
			{
				System.out.print("->"+current.getName());
				visited.add(current);
				return findPath(current.goSouth(), goal, visited);
			}
			if(current.goEast() != null && !visited.contains(current.goNorth()) )
			{
				System.out.print("->"+current.getName());
				return findPath(current.goEast(), current, goal);
			}
			
			if(current.goWest() != null && !visited.contains(current.goNorth()) )
			{
				System.out.print("->"+current.getName());
				return findPath(current.goWest(), current, goal);
			}
			//if(current.goNorth())
//			if(current.goNorth() != null)// && current.goNorth() != from)
//			{
//				System.out.print("->"+current.getName());
//				return findPath(current.goNorth(), current, goal);
//			}
		
			if(current.goSouth() != null )//&& current.goSouth() != from)
			{
				System.out.print("->"+current.getName());
				return findPath(current.goSouth(), current, goal);
			}
			if(current.goEast() != null)// && current.goEast() != from)
			{
				System.out.print("->"+current.getName());
				return findPath(current.goEast(), current, goal);
			}
			
			if(current.goWest() != null)// && current.goWest() != from)
			{
				System.out.print("->"+current.getName());
				return findPath(current.goWest(), current, goal);
			}
			
			else		
			{
				return new String("not found");
			}
			
			// Your code goes here...
			// Hint: When you enter a room (i.e., current) search each connected,
			// non-null room (using goNorth(), goSouth(), goEast(), and goWest()),
			// except the one from which you just came (i.e., from). Stop when the
			// current room's name is the goal.
			
		}
		// Your code goes here...
		// Hint: When you enter a room (i.e., current) search each connected,
 		// non-null room (using goNorth(), goSouth(), goEast(), and goWest()),
		// except ones that are already in the set. Stop when the current room's
		// name is the goal.
		;
		
		
		
		
		
	

	/**
	 * 	Used to test the functionality of this class.
	 */
	public static void main(String[] args)
	{
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		MazeSolver2 ms = new MazeSolver2();
		MazeRoom start = ms.getEntrance();
		out.println("The entrance to the maze is room " + start.getName());
		out.print("Enter the destination room name: ");
		String goal = in.next();
		String path = ms.findPath(start, goal, new HashSet<MazeRoom>());
		out.print("\nThe path from " + start.getName() + " to " + goal + " is ");
		out.println(path == null ? "non existent!" : (path + "."));
	}

}