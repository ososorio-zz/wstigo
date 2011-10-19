package com.aa.business.dto;

import co.com.colombiamovil.comprasterceros.service.ParamDTO;

public class ShoppingRequestDTO  implements java.io.Serializable {
   
	/**
	 * Serial Version UID. 
	 */
	private static final long serialVersionUID = 6819086779418209717L;

	public enum ProcessActionEnum {
		ACQUIRE,
		CANCEL,
		ACQUIRE_MASSIVE,
		CANCEL_MASSIVE
	}
	
	
	private ProcessActionEnum action;

    private String mobileNumber;

    private ParamDTO[] parameters;

    private Integer purchasedProductId;

    private String reason;

    private String userSeller;

    public ShoppingRequestDTO() {
    }

    public ShoppingRequestDTO(
           ProcessActionEnum action,
           String mobileNumber,
           ParamDTO[] parameters,
           Integer purchasedProductId,
           String reason,
           String userSeller) {
           this.action = action;
           this.mobileNumber = mobileNumber;
           this.parameters = parameters;
           this.purchasedProductId = purchasedProductId;
           this.reason = reason;
           this.userSeller = userSeller;
    }


    /**
     * Gets the action value for this ShoppingRequestDTO.
     * 
     * @return action
     */
    public ProcessActionEnum getAction() {
        return action;
    }


    /**
     * Sets the action value for this ShoppingRequestDTO.
     * 
     * @param action
     */
    public void setAction(ProcessActionEnum action) {
        this.action = action;
    }


    /**
     * Gets the mobileNumber value for this ShoppingRequestDTO.
     * 
     * @return mobileNumber
     */
    public String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this ShoppingRequestDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the parameters value for this ShoppingRequestDTO.
     * 
     * @return parameters
     */
    public co.com.colombiamovil.comprasterceros.service.ParamDTO[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this ShoppingRequestDTO.
     * 
     * @param parameters
     */
    public void setParameters(co.com.colombiamovil.comprasterceros.service.ParamDTO[] parameters) {
        this.parameters = parameters;
    }

    public co.com.colombiamovil.comprasterceros.service.ParamDTO getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, co.com.colombiamovil.comprasterceros.service.ParamDTO _value) {
        this.parameters[i] = _value;
    }


    /**
     * Gets the purchasedProductId value for this ShoppingRequestDTO.
     * 
     * @return purchasedProductId
     */
    public Integer getPurchasedProductId() {
        return purchasedProductId;
    }


    /**
     * Sets the purchasedProductId value for this ShoppingRequestDTO.
     * 
     * @param purchasedProductId
     */
    public void setPurchasedProductId(Integer purchasedProductId) {
        this.purchasedProductId = purchasedProductId;
    }


    /**
     * Gets the reason value for this ShoppingRequestDTO.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ShoppingRequestDTO.
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * Gets the userSeller value for this ShoppingRequestDTO.
     * 
     * @return userSeller
     */
    public java.lang.String getUserSeller() {
        return userSeller;
    }


    /**
     * Sets the userSeller value for this ShoppingRequestDTO.
     * 
     * @param userSeller
     */
    public void setUserSeller(String userSeller) {
        this.userSeller = userSeller;
    }

}
