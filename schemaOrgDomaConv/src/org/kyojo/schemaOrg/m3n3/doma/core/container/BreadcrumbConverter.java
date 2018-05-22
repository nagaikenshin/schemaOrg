package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BREADCRUMB;
import org.kyojo.schemaOrg.m3n3.core.Container.Breadcrumb;

@ExternalDomain
public class BreadcrumbConverter implements DomainConverter<Breadcrumb, String> {

	@Override
	public String fromDomainToValue(Breadcrumb domain) {
		return domain.getNativeValue();
	}

	@Override
	public Breadcrumb fromValueToDomain(String value) {
		return new BREADCRUMB(value);
	}

}
