package org.kyojo.schemaOrg.m3n3.doma.bib.bookFormatType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.bookFormatType.GRAPHIC_NOVEL;
import org.kyojo.schemaOrg.m3n3.bib.BookFormatType.GraphicNovel;

@ExternalDomain
public class GraphicNovelConverter implements DomainConverter<GraphicNovel, String> {

	@Override
	public String fromDomainToValue(GraphicNovel domain) {
		return domain.getNativeValue();
	}

	@Override
	public GraphicNovel fromValueToDomain(String value) {
		return new GRAPHIC_NOVEL(value);
	}

}
