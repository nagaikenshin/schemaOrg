package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DISAGREE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DisagreeAction;

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
