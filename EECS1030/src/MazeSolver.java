import java.io.PrintStream;
import java.util.Scanner;

/**
 * Given a MazeRoom and a room name, the search facility of this class will
 * return a path to the desired room, if one exists.
 */
public class MazeSolver
{
	private MazeRoom start;

	/**
	 * Initializes this object.
	 */
	public MazeSolver()
	{
		start = MazeRoom.buildMaze();
	}

	/**
	 * Provides access to the maze entrance.
	 * 
	 * @return the entrance to the maze.
	 */
	public MazeRoom getEntrance()
	{
		return start;
	}

	/**
	 * Finds a path from the current room in the maze to the room with the name
	 * provided by goal, if one exists.
	 * 
	 * @param current
	 *            the current room being searched.
	 * @param from
	 *            the room (just searched) through which this room was entered.
	 * @param goal
	 *            the name of the destination room.
	 * @return a path from the current room to the goal (e.g., "A->F->G"), or
	 *         null if no path exists.
	 */
	public String findPath(MazeRoom current, MazeRoom from, String goal)
	{
		if (current.getName().equals(goal))
		{

			return current.getName();
		}

		else
		{
			String path = null;

			if (path == null && current.goWest() != null
					&& current.goWest() != from)

			{
				path = findPath(current.goWest(), current, goal);
			}

			if (path == null && current.goEast() != null
					&& current.goEast() != from)

			{
				path = findPath(current.goEast(), current, goal);
			}

			if (path == null && current.goSouth() != null
					&& current.goSouth() != from)

			{
				path = findPath(current.goSouth(), current, goal);
			}

			if (path == null && current.goNorth() != null
					&& current.goNorth() != from)

			{
				path = findPath(current.goNorth(), current, goal);
			}

			if (path == null)
			{
				return null;
			}

			else
			{
				return current.getName() + " -> " + path;

			}
		}
	}

	/**
	 * Used to test the functionality of this class.
	 */
	public static void main(String[] args)
	{
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		MazeSolver ms = new MazeSolver();
		MazeRoom start = ms.getEntrance();
		out.println("The entrance to the maze is room " + start.getName());
		out.print("Enter the destination room name: ");
		String goal = in.next();
		String path = ms.findPath(start, null, goal);
		out.print("The path from " + start.getName() + " to " + goal + " is ");
		out.println(path == null ? "non existent!" : (path + "."));
	}
}