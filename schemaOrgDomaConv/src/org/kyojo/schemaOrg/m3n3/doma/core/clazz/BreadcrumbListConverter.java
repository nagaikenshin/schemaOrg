package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BREADCRUMB_LIST;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BreadcrumbList;

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
