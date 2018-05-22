package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHILD_CARE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ChildCare;

@ExternalDomain
public class ChildCareConverter implements DomainConverter<ChildCare, String> {

	@Override
	public String fromDomainToValue(ChildCare domain) {
		return domain.getNativeValue();
	}

	@Override
	public ChildCare fromValueToDomain(String value) {
		return new CHILD_CARE(value);
	}

}
