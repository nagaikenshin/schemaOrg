package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRANSFER_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TransferAction;

@ExternalDomain
public class TransferActionConverter implements DomainConverter<TransferAction, String> {

	@Override
	public String fromDomainToValue(TransferAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public TransferAction fromValueToDomain(String value) {
		return new TRANSFER_ACTION(value);
	}

}
