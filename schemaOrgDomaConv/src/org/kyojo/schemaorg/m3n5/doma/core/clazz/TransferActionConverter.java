package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TRANSFER_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.TransferAction;

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
