package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISAGREE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DisagreeAction;

@ExternalDomain
public class DisagreeActionConverter implements DomainConverter<DisagreeAction, String> {

	@Override
	public String fromDomainToValue(DisagreeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DisagreeAction fromValueToDomain(String value) {
		return new DISAGREE_ACTION(value);
	}

}
