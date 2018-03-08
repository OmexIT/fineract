package org.apache.fineract.infrastructure.paymentgateway.gatewaysubscriber.data;

import java.util.Date;

import org.apache.fineract.infrastructure.paymentgateway.gatewaysubscriber.domain.GatewaySubscriber;
import org.apache.fineract.infrastructure.paymentgateway.payment.types.PaymentEntity;
import org.apache.fineract.useradministration.domain.AppUser;

public class GatewaySubscriberData {
	private Long id;
	private Long clientId;
	private Long entityId;
	/**
	 * A value from {@link PaymentEntity}.
	 */
	private PaymentEntity paymentEntity;
	private String paymentRef;
	private Date dateCreated;
	private Date lastModified;
	private AppUser createdBy;

	public GatewaySubscriberData(GatewaySubscriber gatewaySubscriber) {
		super();
		this.id = gatewaySubscriber.getId();
		this.clientId = gatewaySubscriber.getClientId();
		this.entityId = gatewaySubscriber.getEntityId();
		this.paymentEntity = PaymentEntity.fromInt(gatewaySubscriber.getPaymentEntity());
		this.paymentRef = gatewaySubscriber.getPaymentRef();
		this.dateCreated = gatewaySubscriber.getDateCreated();
		this.lastModified = gatewaySubscriber.getLastModified();
		this.createdBy = gatewaySubscriber.getCreatedBy();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public PaymentEntity getPaymentEntity() {
		return paymentEntity;
	}

	public void setPaymentEntity(PaymentEntity paymentEntity) {
		this.paymentEntity = paymentEntity;
	}

	public String getPaymentRef() {
		return paymentRef;
	}

	public void setPaymentRef(String paymentRef) {
		this.paymentRef = paymentRef;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public AppUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(AppUser createdBy) {
		this.createdBy = createdBy;
	}

}
