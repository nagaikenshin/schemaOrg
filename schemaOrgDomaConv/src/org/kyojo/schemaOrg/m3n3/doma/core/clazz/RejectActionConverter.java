package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REJECT_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RejectAction;

@ExternalDomain
public class RejectActionConverter implements DomainConverter<RejectAction, String> {

	@Override
	public String fromDomainToValue(RejectAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public RejectAction fromValueToDomain(String value) {
		return new REJECT_ACTION(value);
	}

}
