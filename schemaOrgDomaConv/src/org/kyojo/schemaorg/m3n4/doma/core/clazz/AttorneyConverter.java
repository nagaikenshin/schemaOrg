package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ATTORNEY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Attorney;

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
