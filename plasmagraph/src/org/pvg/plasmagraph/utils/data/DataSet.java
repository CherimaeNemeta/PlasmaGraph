package org.pvg.plasmagraph.utils.data;

import java.util.ArrayList;
import java.util.Iterator;


//TODO: Everything.
public class DataSet implements Iterable<DataColumn>, Iterator<DataColumn> {
	ArrayList<DataColumn> values;
	
	public DataSet () {
		values = new ArrayList<DataColumn> ();
	}
	
	@Override
	public Iterator<DataColumn> iterator () {
		return (this);
	}

	@Override
	public boolean hasNext () {
		// TODO Auto-generated method stub
		/*
		if (count < str.length()){
	      return true;
	    }  
	    return false;
		*/
		return false;
	}

	@Override
	public DataColumn next () {
		// TODO Auto-generated method stub
		/*
		if (count == str.length())
	      throw new NoSuchElementException();
	
	    count++;
	    return str.charAt(count - 1);
		*/
		return null;
	}

	@Override
	public void remove () {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException();
	}

	public int find(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}