package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MODEL;
import org.kyojo.schemaOrg.m3n3.core.Container.Model;

@ExternalDomain
public class ModelConverter implements DomainConverter<Model, String> {

	@Override
	public String fromDomainToValue(Model domain) {
		return domain.getNativeValue();
	}

	@Override
	public Model fromValueToDomain(String value) {
		return new MODEL(value);
	}

}
