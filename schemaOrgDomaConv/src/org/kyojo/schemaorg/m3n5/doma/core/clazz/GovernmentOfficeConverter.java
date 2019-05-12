package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GOVERNMENT_OFFICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.GovernmentOffice;

@ExternalDomain
public class GovernmentOfficeConverter implements DomainConverter<GovernmentOffice, String> {

	@Override
	public String fromDomainToValue(GovernmentOffice domain) {
		return domain.getNativeValue();
	}

	@Override
	public GovernmentOffice fromValueToDomain(String value) {
		return new GOVERNMENT_OFFICE(value);
	}

}
