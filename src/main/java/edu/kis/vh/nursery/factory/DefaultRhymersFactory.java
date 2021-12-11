package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

@Override
<<<<<<< HEAD
public defaultCountingOutRhymer getStandardRhymer() {
	return new defaultCountingOutRhymer();
}

@Override
public defaultCountingOutRhymer getFalseRhymer() {
	return new defaultCountingOutRhymer();
}

@Override
public defaultCountingOutRhymer getFIFORhymer() {
	return new FIFORhymer();
}

@Override
public defaultCountingOutRhymer getHanoiRhymer() {
=======
public DefaultCountingOutRhymer GetStandardRhymer() {
	return new DefaultCountingOutRhymer();
}

@Override
public DefaultCountingOutRhymer GetFalseRhymer() {
	return new DefaultCountingOutRhymer();
}

@Override
public DefaultCountingOutRhymer GetFIFORhymer() {
	return new FifoRhymer();
}

@Override
public DefaultCountingOutRhymer GetHanoiRhymer() {
>>>>>>> efaff84 (1.3.5. poprawa nazewnictwa klas)
	return new HanoiRhymer();
}

}
