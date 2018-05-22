package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPART_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DepartAction;

@ExternalDomain
public class DepartActionConverter implements DomainConverter<DepartAction, String> {

	@Override
	public String fromDomainToValue(DepartAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepartAction fromValueToDomain(String value) {
		return new DEPART_ACTION(value);
	}

}
