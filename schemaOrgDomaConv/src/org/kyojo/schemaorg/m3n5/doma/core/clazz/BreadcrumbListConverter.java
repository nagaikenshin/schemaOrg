package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BREADCRUMB_LIST;
import org.kyojo.schemaorg.m3n5.core.Clazz.BreadcrumbList;

@ExternalDomain
public class BreadcrumbListConverter implements DomainConverter<BreadcrumbList, String> {

	@Override
	public String fromDomainToValue(BreadcrumbList domain) {
		return domain.getNativeValue();
	}

	@Override
	public BreadcrumbList fromValueToDomain(String value) {
		return new BREADCRUMB_LIST(value);
	}

}
