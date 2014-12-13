package p3;

import p1.A;
import p1.A;//ignored. Duplicate import declaration
import p2.*;
import p2.*;//duplicate ignored import declaration
public class C {
	A var; //Will always use p1.A
}
