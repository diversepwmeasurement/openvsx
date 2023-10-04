/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import org.eclipse.openvsx.jooq.tables.NamespaceSocialLinks;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NamespaceSocialLinksRecord extends TableRecordImpl<NamespaceSocialLinksRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.namespace_social_links.namespace_id</code>.
     */
    public void setNamespaceId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.namespace_social_links.namespace_id</code>.
     */
    public Long getNamespaceId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.namespace_social_links.provider</code>.
     */
    public void setProvider(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.namespace_social_links.provider</code>.
     */
    public String getProvider() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.namespace_social_links.social_link</code>.
     */
    public void setSocialLink(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.namespace_social_links.social_link</code>.
     */
    public String getSocialLink() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return NamespaceSocialLinks.NAMESPACE_SOCIAL_LINKS.NAMESPACE_ID;
    }

    @Override
    public Field<String> field2() {
        return NamespaceSocialLinks.NAMESPACE_SOCIAL_LINKS.PROVIDER;
    }

    @Override
    public Field<String> field3() {
        return NamespaceSocialLinks.NAMESPACE_SOCIAL_LINKS.SOCIAL_LINK;
    }

    @Override
    public Long component1() {
        return getNamespaceId();
    }

    @Override
    public String component2() {
        return getProvider();
    }

    @Override
    public String component3() {
        return getSocialLink();
    }

    @Override
    public Long value1() {
        return getNamespaceId();
    }

    @Override
    public String value2() {
        return getProvider();
    }

    @Override
    public String value3() {
        return getSocialLink();
    }

    @Override
    public NamespaceSocialLinksRecord value1(Long value) {
        setNamespaceId(value);
        return this;
    }

    @Override
    public NamespaceSocialLinksRecord value2(String value) {
        setProvider(value);
        return this;
    }

    @Override
    public NamespaceSocialLinksRecord value3(String value) {
        setSocialLink(value);
        return this;
    }

    @Override
    public NamespaceSocialLinksRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NamespaceSocialLinksRecord
     */
    public NamespaceSocialLinksRecord() {
        super(NamespaceSocialLinks.NAMESPACE_SOCIAL_LINKS);
    }

    /**
     * Create a detached, initialised NamespaceSocialLinksRecord
     */
    public NamespaceSocialLinksRecord(Long namespaceId, String provider, String socialLink) {
        super(NamespaceSocialLinks.NAMESPACE_SOCIAL_LINKS);

        setNamespaceId(namespaceId);
        setProvider(provider);
        setSocialLink(socialLink);
        resetChangedOnNotNull();
    }
}
