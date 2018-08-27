package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DIAGRAM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Diagram;

@ExternalDomain
public class DiagramConverter implements DomainConverter<Diagram, String> {

	@Override
	public String fromDomainToValue(Diagram domain) {
		return domain.getNativeValue();
	}

	@Override
	public Diagram fromValueToDomain(String value) {
		return new DIAGRAM(value);
	}

}