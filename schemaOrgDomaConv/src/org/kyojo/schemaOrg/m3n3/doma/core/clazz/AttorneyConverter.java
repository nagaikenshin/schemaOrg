package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ATTORNEY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Attorney;

@ExternalDomain
public class AttorneyConverter implements DomainConverter<Attorney, String> {

	@Override
	public String fromDomainToValue(Attorney domain) {
		return domain.getNativeValue();
	}

	@Override
	public Attorney fromValueToDomain(String value) {
		return new ATTORNEY(value);
	}

}
