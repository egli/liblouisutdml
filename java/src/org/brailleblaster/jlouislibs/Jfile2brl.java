package org.brailleblaster.jlouislibs;

import org.brailleblaster.jlouislibs.Jliblouisutdml;

public class Jfile2brl
{
public static void main (String[] args)
{
Jliblouisutdml bindings = new Jliblouisutdml ();
bindings.lbu_translateTextFile ("default.cfg", args[0], args[1], 
"logfile", 
null, 0);
String version = bindings.lbu_version ();
}
}

