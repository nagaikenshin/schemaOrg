package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MARRY_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MarryAction;

@ExternalDomain
public class MarryActionConverter implements DomainConverter<MarryAction, String> {

	@Override
	public String fromDomainToValue(MarryAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public MarryAction fromValueToDomain(String value) {
		return new MARRY_ACTION(value);
	}

}
