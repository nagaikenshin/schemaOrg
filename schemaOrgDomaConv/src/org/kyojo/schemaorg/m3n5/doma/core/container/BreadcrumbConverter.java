package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BREADCRUMB;
import org.kyojo.schemaorg.m3n5.core.Container.Breadcrumb;

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
