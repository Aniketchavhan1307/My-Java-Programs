		// merge   
		// shuffle()
		// searchBy()
		// makePlayList()



package demo;

import java.util.ArrayList;


import java.util.Collections;

import java.util.List;
import java.util.ListIterator;

public class SongDriver
{
	static List<Song> addSong = new ArrayList();
	
	public static void main(String[] args) 
	{
		List<Song> happy = new ArrayList<Song>();
		
		happy.add(new Song("ye apna dil diwana", "romantic", "ravi", "xyz"));
		happy.add(new Song("kya hua tera vada ye kasam ye erada", "romantic", "Aniket", "eyz"));
		happy.add(new Song("kolaveri di", "happy", "dhanush", "prem"));
		
		
//		ListIterator<Song> li = happy.listIterator();
//		
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//
//		}
		
		List <Song> sad = new ArrayList<Song>();
		
		sad.add(new Song("jag suna suna lage", "sad", "Mehboob", "om shanti"));
		sad.add(new Song("tujhe bhula diya", "sad", "mohit chavhan", "Anjaana Anjaani"));
		sad.add(new Song("Hamari Adhuri kahani", "sad", "jeet Gannguli", "Hamari Adhuri kahani"));
		sad.add(new Song("agar tum saath ho", "sad", "alka yagnik", "Tamasha"));
		
		//System.out.println(sad);
		
		List <Song> romantic = new ArrayList<Song>();
		 romantic.add(new Song("hello", "romantic", "Aniket", "Undefined"));
		 
		
		 addSong = merge(sad);
		 addSong = merge(happy);
		 addSong = merge(romantic);
		
		
		ListIterator<Song> li = addSong.listIterator();
	
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//
//		}
		
		//System.out.println(suffleSong(sad));
		
		List<Song> suf = suffleSong(sad);
		
		ListIterator<Song> i = suf.listIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());

		}
	
	}
	
	public static List<Song> merge(List<Song> li)
	{
		
		addSong.addAll(li);
	
		return addSong;
	
			
	}
	
	public static List<Song> suffleSong(List<Song> li)
	{
		Collections.shuffle(li);
		
		return li;
	}
	
	
	
	


}
