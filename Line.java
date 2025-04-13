package linecomparison;


// Line class to represent a line and compare its length
class Line implements Comparable<Line> 
{
	Point start, end;

	Line(Point start, Point end) 
	{
		this.start = start;
		this.end = end;
	}

	// Calculate length of the line
	public double getLength() 
	{
		return Math.sqrt(Math.pow((end.x - start.x), 2) + Math.pow((end.y - start.y), 2));
	}

	// Compare this line with another using compareTo
	@Override
	public int compareTo(Line other) 
	{
		return Double.compare(this.getLength(), other.getLength());
	}

	// Check if two lines are equal in length
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (!(obj instanceof Line)) return false;
		Line other = (Line) obj;
		return Double.valueOf(this.getLength()).equals(other.getLength());
	}
}


