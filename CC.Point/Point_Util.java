package CC.Point;

import CC.COd.Finishd;

@Finishd(Is_Finishd=true)
public abstract class Point_Util
{
	// <editor-fold desc="Mach">
	@Finishd(Is_Finishd=true)
	public static boolean Mach(Object A,Object B,
							   Object C,Object D)
	{	return ((A==C)&&(B==D));   }
	@Finishd(Is_Finishd=true)
	public static boolean Mach_Comutbl(Object A,Object B,
									   Object C,Object D)
	{
		return Mach(A,B,C,D)|
			   Mach(A,B,D,C);
	}
	@Finishd(Is_Finishd=true)
	public static boolean Mach_Ethr(Object A,
						   Object B,Object C)
	{
		return (A==B)|
			   (A==C);
	}
	// <editor-fold desc="Only">
	@Finishd(Is_Finishd=true)
	public static boolean Mach_Only_A(Object Point,
							 Object A,Object B)
	{
		return ((Point==A)&&
				(Point!=B));
	}
	@Finishd(Is_Finishd=true)
	public static boolean Mach_Only_B(Object Point,
							 Object A,Object B)
	{
		return ((Point!=A)&&
				(Point==B));
	}
	@Finishd(Is_Finishd=true)
	public static boolean Mach_Only_1(Object Point,
							 Object A,Object B)
	{
		return Mach_Only_A(Point,A,B)|
			   Mach_Only_B(Point,A,B);
	}
	@Finishd(Is_Finishd=true)
	public static <Typ>Typ Pik_Th_Othr(Typ Point,
								 Typ A,Typ B)
	{
		return (Point==A)?(Point==B)?null:
										B:
						  (Point==B)?   A:
									 null;
	}
	//</editor-fold>
	//</editor-fold>

	@Finishd(Is_Finishd=true)
	public static <Typ>Typ Gar_Acceptbl(Typ Old,
										Object Unacceptbl,Typ Acceptbl)
	{
		return (Old!=Unacceptbl)?Old:
							Acceptbl;
	}

	@Finishd(Is_Finishd=true)
	public static int Count_Object(Object Point)
	{	return (Point!=null)?1:0;   }
		@Finishd(Is_Finishd=true)
		public static <Typ>int Count_Objectg(Typ[] Pointg)
		{
			int Count=0;
			for(Typ Point:Pointg)
			{	Count+=Count_Object(Point);   }

			return Count;
		}
		@Finishd(Is_Finishd=true)
		public static <Typ>int Count_Object(Typ... Pointg)
		{	return Count_Objectg(Pointg);   }
}