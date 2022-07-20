// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package com.maplecloudy.osrt.model.maven;

/**
 * Contains the information needed for deploying websites.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Site
    implements java.io.Serializable, Cloneable, InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     *
     *
     *             A unique identifier for a deployment location.
     * This is used to match the
     *             site to configuration in the
     * <code>settings.xml</code> file, for example.
     *
     *
     */
    private String id;

    /**
     * Human readable name of the deployment location.
     */
    private String name;

    /**
     *
     *
     *             The url of the location where website is
     * deployed, in the form <code>protocol://hostname/path</code>.
     *             <br><b>Default value is</b>: parent value [+
     * path adjustment] + (artifactId or
     * <code>project.directory</code> property), or just parent
     * value if
     *
     * <code>child.urls.inherit.append.path="false"</code>
     *
     *
     */
    private String url;

    /**
     *
     *
     *             When childs inherit from urls, append path or
     * not?. Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>
     *             <br /><b>Default value is</b>: <code>true</code>
     *
     *
     */
    private String childInheritAppendPath;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     *
     * @return Site
     */
    public Site clone()
    {
        try
        {
            Site copy = (Site) super.clone();

            if ( copy.locations != null )
            {
                copy.locations = new java.util.LinkedHashMap( copy.locations );
            }

            return copy;
        }
        catch ( Exception ex )
        {
            throw (RuntimeException) new UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- Site clone()

    /**
     * Get when childs inherit from urls, append path or not?.
     * Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>
     *             <br /><b>Default value is</b>: <code>true</code>
     * 
     * @return String
     */
    public String getChildInheritAppendPath()
    {
        return this.childInheritAppendPath;
    } //-- String getChildInheritAppendPath()

    /**
     * Get a unique identifier for a deployment location. This is
     * used to match the
     *             site to configuration in the
     * <code>settings.xml</code> file, for example.
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * 
     * 
     * @param key
     * @return InputLocation
     */
    public InputLocation getLocation( Object key )
    {
        return ( locations != null ) ? locations.get( key ) : null;
    } //-- InputLocation getLocation( Object )

    /**
     * Get human readable name of the deployment location.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get the url of the location where website is deployed, in
     * the form <code>protocol://hostname/path</code>.
     *             <br><b>Default value is</b>: parent value [+
     * path adjustment] + (artifactId or
     * <code>project.directory</code> property), or just parent
     * value if 
     *            
     * <code>child.urls.inherit.append.path="false"</code>
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * Set when childs inherit from urls, append path or not?.
     * Note: While the type
     *             of this field is <code>String</code> for
     * technical reasons, the semantic type is actually
     *             <code>Boolean</code>
     *             <br /><b>Default value is</b>: <code>true</code>
     * 
     * @param childInheritAppendPath
     */
    public void setChildInheritAppendPath( String childInheritAppendPath )
    {
        this.childInheritAppendPath = childInheritAppendPath;
    } //-- void setChildInheritAppendPath( String )

    /**
     * Set a unique identifier for a deployment location. This is
     * used to match the
     *             site to configuration in the
     * <code>settings.xml</code> file, for example.
     * 
     * @param id
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    /**
     * 
     * 
     * @param key
     * @param location
     */
    public void setLocation( Object key, InputLocation location )
    {
        if ( location != null )
        {
            if ( this.locations == null )
            {
                this.locations = new java.util.LinkedHashMap<Object, InputLocation>();
            }
            this.locations.put( key, location );
        }
    } //-- void setLocation( Object, InputLocation )

    /**
     * Set human readable name of the deployment location.
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the url of the location where website is deployed, in
     * the form <code>protocol://hostname/path</code>.
     *             <br><b>Default value is</b>: parent value [+
     * path adjustment] + (artifactId or
     * <code>project.directory</code> property), or just parent
     * value if 
     *            
     * <code>child.urls.inherit.append.path="false"</code>
     * 
     * @param url
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

    
            
    public boolean isChildInheritAppendPath()
    {
        return ( childInheritAppendPath != null ) ? Boolean.parseBoolean( childInheritAppendPath ) : true;
    }

    public void setChildInheritAppendPath( boolean childInheritAppendPath )
    {
        this.childInheritAppendPath = String.valueOf( childInheritAppendPath );
    }
            
          
}