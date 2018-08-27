package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EDITOR;
import org.kyojo.schemaorg.m3n4.core.Container.Editor;

@ExternalDomain
public class EditorConverter implements DomainConverter<Editor, String> {

	@Override
	public String fromDomainToValue(Editor domain) {
		return domain.getNativeValue();
	}

	@Override
	public Editor fromValueToDomain(String value) {
		return new EDITOR(value);
	}

}
