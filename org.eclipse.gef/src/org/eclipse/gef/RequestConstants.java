package org.eclipse.gef;

/**
 * The set of constants used to identify <code>Requests</code> by their {@link
 * Request#getType() type}. Applications can extend this set of constants with their own.
 */
public interface RequestConstants {

/**
 * Constant used to identify the creation of a new connection. Creating a connection
 * involves both the source node and target node EditParts. This is the constant that is
 * used with the first node on which the user clicks.
 */
String REQ_CONNECTION_START  = "connection start";//$NON-NLS-1$

/**
 * Constant used to identify the end of creation of a new connection. Creating a
 * connection involves both the source node and target node EditParts. This is the
 * constant that is used with the second node on which the user clicks.
 */
String REQ_CONNECTION_END    = "connection end";//$NON-NLS-1$

/**
 * Constant used to indicate that the <i>source</i> end of an existing connection is being
 * reconnected to a new source node EditPart. The new source node is the receiver of such
 * Requests.
 */
String REQ_RECONNECT_SOURCE  = "Reconnection source";//$NON-NLS-1$

/**
 * Constant used to indicate that the <i>target</i> end of an existing connection is being
 * reconnected to a new target node EditPart. The new target node is the receiver of such
 * Requests.
 */
String REQ_RECONNECT_TARGET  = "Reconnection target";//$NON-NLS-1$

/**
 * Constant used to identify that an existing bendpoint is being moved or dragged by the
 * User.
 */
String REQ_MOVE_BENDPOINT    = "move bendpoint";//$NON-NLS-1$

/**
 * Constant used to identify that an existing bendpoint is being deleted by the User. This
 * generally happens when the user is moving an existing bendpoint into a location that
 * indicates that the bendpoint is no longer needed.
 */
String REQ_DELETE_BENDPOINT  = "delete bendpoint";//$NON-NLS-1$

/**
 * Constant used to identify that a bendpoint is being inserted by the User.
 */
String REQ_CREATE_BENDPOINT  = "create bendpoint";//$NON-NLS-1$

/**
 * Constant used to identify that the receiver of the request is being resized.
 */
String REQ_RESIZE = "resize"; //$NON-NLS-1$

/**
 * Constant used to identify that a group of children are to be resized.
 */
String REQ_RESIZE_CHILDREN = "resize children"; //$NON-NLS-1$

/**
 * Constant used to identify that the receiver of the request is being moved.
 */
String REQ_MOVE = "move"; //$NON-NLS-1$

/**
 * Constant used to identify that a group of children are being moved.
 */
String REQ_MOVE_CHILDREN = "move children"; //$NON-NLS-1$

/**
 * Constant used to identify that the receiver is being removed from its current parent,
 * to be inserted into a new parent.
 */
String REQ_ORPHAN = "orphan"; //$NON-NLS-1$

/**
 * Constant used to identify that a group of children are being removed from the receiver
 * of the Request.
 */
String REQ_ORPHAN_CHILDREN = "orphan children"; //$NON-NLS-1$

/**
 * Constant used to identify that an object is to be created by the receiver of the
 * Request.
 */
String REQ_CREATE = "create child"; //$NON-NLS-1$

/**
 * Constant used to indicate that a group of existing children are being added to the
 * receiver of the Request.
 */
String REQ_ADD = "add children"; //$NON-NLS-1$

/**
 * Constant used to indicate that a connection's source node is being deleted.
 */
String REQ_SOURCE_DELETED = "source deleted"; //$NON-NLS-1$

/**
 * Constant used to indicate that a connection's target node is being deleted.
 */
String REQ_TARGET_DELETED = "target deleted"; //$NON-NLS-1$

/**
 * Constant used to indicate that the receiver of the Request is being deleted.
 */
String REQ_DELETE = "delete"; //$NON-NLS-1$

/**
 * Constant used to indicate that a child of the receiver the Request is to be deleted.
 */
String REQ_DELETE_DEPENDANT = "delete dependant"; //$NON-NLS-1$

/**
 * Constant used to identify that an ancestor of the receiver of the Request is being
 * deleted.
 */
String REQ_ANCESTOR_DELETED = "ancestor deleted"; //$NON-NLS-1$

/**
 * Constant used to indicate that alignment is being performed.
 */
String REQ_ALIGN = "align"; //$NON-NLS-1$

/**
 * Constant used to indicate that a group of children are being aligned.
 */
String REQ_ALIGN_CHILDREN = "align children"; //$NON-NLS-1$

/**
 * Constant used to identify that a direct edit should be performed.
 */
String REQ_DIRECT_EDIT = "direct edit"; //$NON-NLS-1$

/**
 * Constant used to identify selection Requests.
 */
String REQ_SELECTION = "selection"; //$NON-NLS-1$

/**
 * Constant used to identify selection hover Requests.
 */
String REQ_SELECTION_HOVER = "selection hover"; //$NON-NLS-1$

}
