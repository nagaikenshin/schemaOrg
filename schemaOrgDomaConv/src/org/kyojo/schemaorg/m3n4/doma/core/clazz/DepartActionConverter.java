package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DEPART_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepartAction;

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
