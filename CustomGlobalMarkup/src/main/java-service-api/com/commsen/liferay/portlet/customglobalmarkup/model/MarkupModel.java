package com.commsen.liferay.portlet.customglobalmarkup.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Markup service. Represents a row in the &quot;CGM_Markup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.commsen.liferay.portlet.customglobalmarkup.model.impl.MarkupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.commsen.liferay.portlet.customglobalmarkup.model.impl.MarkupImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a markup model instance should use the {@link Markup} interface instead.
 * </p>
 *
 * @author Milen Dyankov
 * @see Markup
 * @see com.commsen.liferay.portlet.customglobalmarkup.model.impl.MarkupImpl
 * @see com.commsen.liferay.portlet.customglobalmarkup.model.impl.MarkupModelImpl
 * @generated
 */
public interface MarkupModel extends BaseModel<Markup> {
    /**
     * Gets the primary key of this markup.
     *
     * @return the primary key of this markup
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this markup
     *
     * @param pk the primary key of this markup
     */
    public void setPrimaryKey(long pk);

    /**
     * Gets the id of this markup.
     *
     * @return the id of this markup
     */
    public long getId();

    /**
     * Sets the id of this markup.
     *
     * @param id the id of this markup
     */
    public void setId(long id);

    /**
     * Gets the company id of this markup.
     *
     * @return the company id of this markup
     */
    public long getCompanyId();

    /**
     * Sets the company id of this markup.
     *
     * @param companyId the company id of this markup
     */
    public void setCompanyId(long companyId);

    /**
     * Gets the group id of this markup.
     *
     * @return the group id of this markup
     */
    public long getGroupId();

    /**
     * Sets the group id of this markup.
     *
     * @param groupId the group id of this markup
     */
    public void setGroupId(long groupId);

    /**
     * Gets the markup of this markup.
     *
     * @return the markup of this markup
     */
    @AutoEscape
    public String getMarkup();

    /**
     * Sets the markup of this markup.
     *
     * @param markup the markup of this markup
     */
    public void setMarkup(String markup);

    /**
     * Gets the active of this markup.
     *
     * @return the active of this markup
     */
    public boolean getActive();

    /**
     * Determines if this markup is active.
     *
     * @return <code>true</code> if this markup is active; <code>false</code> otherwise
     */
    public boolean isActive();

    /**
     * Sets whether this {$entity.humanName} is active.
     *
     * @param active the active of this markup
     */
    public void setActive(boolean active);

    /**
     * Gets the location of this markup.
     *
     * @return the location of this markup
     */
    public short getLocation();

    /**
     * Sets the location of this markup.
     *
     * @param location the location of this markup
     */
    public void setLocation(short location);

    /**
     * Gets a copy of this markup as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
     *
     * @return the escaped model instance
     * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
     */
    public Markup toEscapedModel();

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public void setEscapedModel(boolean escapedModel);

    public Serializable getPrimaryKeyObj();

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(Markup markup);

    public int hashCode();

    public String toString();

    public String toXmlString();
}
