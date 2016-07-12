package com.deloitte.inv.application.model.service;


import java.util.ArrayList;

import java.util.List;

import oracle.maf.api.cdm.persistence.util.EntityUtils;
import oracle.maf.impl.cdm.persistence.service.EntityCRUDService;

import com.deloitte.inv.application.model.QualityPlandetailsOutput;


/**
 *  Service class that provides CRUD and custom operations against the qualityPlandetailsOutput data object.
 *  The behavior of this class is driven by the qualityPlandetailsOutput classMappingDescriptor in persistence-mapping.xml.
 *
 *  You can customize and extend this behavior by overriding methods of the EntityCRUDService superclass, and/or
 *  creating a subclass of the local and remote persistence managers as configured in persistence-mapping.xml.
 */
public class QualityPlandetailsOutputService extends EntityCRUDService<QualityPlandetailsOutput> {

    /**
     * Default constructor. If autoQuery is set to true in the classMappingDescriptor in persistence-mapping.xml, then
     * the findAll method will be executed and the qualityPlandetailsOutput list will be populated when this constructor is invoked.
     * If you created a data control for this service class, the data control will use this constructor, allowing you to
     * immediately show data in your user interface when accessing the data control for the first time.
     * By default, the findAll method will first query the local SQLite database for any rows and show these immediately in
     * the UI. Then the remote findAll method as configured in persistence-mapping.xml will be executed in the background,
     * and the UI will be automatically refreshed when the remote data have been processed and stored in the local SQLite
     * database.
     * If you want the user to wait until the remote data have been processed and not show local data first, you can set
     * the remoteReadInBackground attribute in the classMappingDescriptor to false.
     *
     * If you need programmatic access to the same instance of this class as used by the bean data control typically
     * created for this class, then you can use the following convenience method:
     *
     * QualityPlandetailsOutputService crudService = (QualityPlandetailsOutputService) EntityUtils.getEntityCRUDService(QualityPlandetailsOutput.class);
     *
     * Note that calling this method might fire a remote method call when autoQuery is set to true in the
     * classMappingDescriptor and the data control has not been instantiated yet for the feature context in which you
     * execute the above call. Remember: each feature has its own class loader, bean data controls are NOT shared
     * accross features unless you generated this service class in the ApplicationController project and created the
     * data control there.
     */
    public QualityPlandetailsOutputService() {
    }

    /**
     * Use this constructor with autoQuery=false in Java code when you want to execute a method in this service class
     * without autoQuery as configured in persistence-mapping.xml taking place.
     */
    public QualityPlandetailsOutputService(boolean autoQuery) {
        super(autoQuery);
    }

    /**
     * Use this constructor to get an instance without performing an autoQuery, and with remoteReadInBackground
     * and remoteWriteInBackground set to the values passed in as constructor argument.
     * This constructor overrides (ignores) the settings of these properties in persistence-mapping.xml
     */
    public QualityPlandetailsOutputService(boolean doRemoteReadInBackground, boolean doRemoteWriteInBackground) {
        super(false);
        setDoRemoteReadInBackground(doRemoteReadInBackground);
        setDoRemoteWriteInBackground(doRemoteWriteInBackground);
    }

    protected Class getEntityClass() {
        return QualityPlandetailsOutput.class;
    }

    protected String getEntityListName() {
        return "qualityPlandetailsOutput";
    }

    public List<QualityPlandetailsOutput> getQualityPlandetailsOutput() {
        return getEntityList();
    }

    /**
     * This method is automatically called when using the Create operation on the qualityPlandetailsOutput collection
     * in the data control palette.
     *
     * Note that this method does NOT add the qualityPlandetailsOutput to the entity list because this method is
     * automatically called by MAF framework when using the Create operation from the data control palette.
     * MAF will add the entity to the list AFTER this method has been executed.
     *
     * You can use this method to set default values.
     * If you want to refresh data in the UI based on the size of the entity list, then you cannot do this in this
     * method because the list is not updated yet (see above), instead override method entityAdded and add your
     * logic there. The CDM EntityList class ensures that this method is called after a qualityPlandetailsOutput has been added.
     * If you want to directly add a storage object without using the binding layer, then call the overloaded version
     * of this method with addToList argument set to true.
     *
     * Do NOT drag and drop this method from the data control palette, use the Create operation
     * instead to ensure that iterator binding and qualityPlandetailsOutput list stay in sync.
     * @param index
     * @param qualityPlandetailsOutput
     */
    public void addQualityPlandetailsOutput(int index, QualityPlandetailsOutput qualityPlandetailsOutput) {
        addEntity(index, qualityPlandetailsOutput);
    }

    /**
     * Sets qualityPlandetailsOutput state to new, and if addToList argument is true, it adds the qualityPlandetailsOutput to the
     * qualityPlandetailsOutput list and and fires change event to refresh the list in the UI
     * @param index
     * @param qualityPlandetailsOutput
     * @param addToList
     */
    public void addQualityPlandetailsOutput(int index, QualityPlandetailsOutput qualityPlandetailsOutput,
                                            boolean addToList) {
        addEntity(index, qualityPlandetailsOutput, addToList);
    }

    /**
     * This method is automatically called when using the Delete operation on the qualityPlandetailsOutput collection
     * in the data control palette. It deletes the corresponding row from the database (if persisted) and
     * calls the configured remove method on the remote persistence manager.
     *
     * Note that this method does NOT remove the qualityPlandetailsOutput from the entity list because this method is
     * automatically called by MAF framework when using the Delete operation from the data control palette.
     * MAF will remove the entity from the list AFTER this method has been executed.
     * If you want to directly remove a storage object without using the binding layer, then call the overloaded version
     * of this method with removeFromList argument set to true.
     *
     * If you want to refresh data in the UI based on the size of the entity list, then you cannot do this in this
     * method because the list is not updated yet (see above), instead override method entityRemoved and add your
     * logic there. The CDM EntityList class ensures that this refresh method is called after a qualityPlandetailsOutput has been added.
     *
     * Do NOT drag and drop this method from the data control palette, use the Delete operation
     * instead to ensure that iterator binding and qualityPlandetailsOutput list stay in sync.
     * @param qualityPlandetailsOutput
     */
    public void removeQualityPlandetailsOutput(QualityPlandetailsOutput qualityPlandetailsOutput) {
        removeEntity(qualityPlandetailsOutput);
    }


    /**
     * Removes a qualityPlandetailsOutput using the configured local and remote persistence managers.
     * If removeFromList argument is true, it removes the qualityPlandetailsOutput from the
     * a qualityPlandetailsOutput list and and fires change event to refresh the list in the UI
     * @param a qualityPlandetailsOutput
     * @param removeFromList
     */
    public void removeQualityPlandetailsOutput(QualityPlandetailsOutput qualityPlandetailsOutput,
                                               boolean removeFromList) {
        removeEntity(qualityPlandetailsOutput, removeFromList);
    }

    /**
     * Inserts or updates a qualityPlandetailsOutput using the configured persistence managers.
     * The insert or update is determined by calling isNewEntity on the qualityPlandetailsOutput instance.
     * @param qualityPlandetailsOutput
     */
    public void saveQualityPlandetailsOutput(QualityPlandetailsOutput qualityPlandetailsOutput) {
        super.mergeEntity(qualityPlandetailsOutput);
    }

    /**
     * Retrieves all qualityPlandetailsOutput instances using the configured persistence managers and populates the qualityPlandetailsOutput list
     * with the result.
     * When this method is called for the first time, and a remote persistence manager is configured,
     * the data is fetched remotely and the local DB is populated with the results.
     */
    public void findAllQualityPlandetailsOutput() {
        super.findAll();
    }

    /**
     * Retrieves all qualityPlandetailsOutput instances using the findAll method on the remote persistence manager
     * and populates the qualityPlandetailsOutput list
     */
    public void findAllQualityPlandetailsOutputRemote() {
        super.doRemoteFindAll();
    }

    /**
     * Retrieves the qualityPlandetailsOutput instances that match the searchValue filter using the configured persistence
     * managers and populates the qualityPlandetailsOutput list with the result.
     * By default, the search value is applied to all string attributes using a "startsWith" operator.
     * To customize the attributes on which the searchValue is applied, you can override method getQuickSearchAttributeNames.
     * If a find method is configured against the remote persistence manager, then this method will also
     * call this method.
     * @param searchValue
     */
    public void findQualityPlandetailsOutput(String searchValue) {
        super.find(searchValue);
    }


    /**
     * Resets the values of the qualityPlandetailsOutput instance to the values as stored in the SQLite database. This method
     * will do nothing when the qualityPlandetailsOutput is not persisted to the database.
     * @param qualityPlandetailsOutput
     */
    public void resetQualityPlandetailsOutput(QualityPlandetailsOutput qualityPlandetailsOutput) {
        super.resetEntity(qualityPlandetailsOutput);
    }


}


