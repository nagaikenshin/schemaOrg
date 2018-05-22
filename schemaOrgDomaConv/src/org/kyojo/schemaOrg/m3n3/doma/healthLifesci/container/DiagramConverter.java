package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DIAGRAM;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diagram;

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
