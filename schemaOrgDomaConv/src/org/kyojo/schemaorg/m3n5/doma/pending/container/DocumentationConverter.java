package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.DOCUMENTATION;
import org.kyojo.schemaorg.m3n5.pending.Container.Documentation;

@ExternalDomain
public class DocumentationConverter implements DomainConverter<Documentation, String> {

	@Override
	public String fromDomainToValue(Documentation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Documentation fromValueToDomain(String value) {
		return new DOCUMENTATION(value);
	}

}
