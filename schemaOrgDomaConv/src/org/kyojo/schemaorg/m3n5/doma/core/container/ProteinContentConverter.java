package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PROTEIN_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.ProteinContent;

@ExternalDomain
public class ProteinContentConverter implements DomainConverter<ProteinContent, String> {

	@Override
	public String fromDomainToValue(ProteinContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProteinContent fromValueToDomain(String value) {
		return new PROTEIN_CONTENT(value);
	}

}
