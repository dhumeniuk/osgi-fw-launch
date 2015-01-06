package example.project;

import aQute.bnd.annotation.ConsumerType;

/**
 * This is an example of an interface that is expected to be implemented by Consumers of the API; for example this
 * interface may define a listener or a callback. Adding methods to this interface is a MAJOR change, because ALL
 * clients are affected.
 * 
 * <p>
 * More comments.
 * 
 * @see ConsumerType
 * @since 1.0
 */
@ConsumerType
public interface ExampleConsumerInterface {

	// TODO: interface provided by template

	void someMethod();
	
}