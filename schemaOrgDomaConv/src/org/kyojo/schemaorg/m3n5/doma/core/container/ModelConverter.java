package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MODEL;
import org.kyojo.schemaorg.m3n5.core.Container.Model;

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
